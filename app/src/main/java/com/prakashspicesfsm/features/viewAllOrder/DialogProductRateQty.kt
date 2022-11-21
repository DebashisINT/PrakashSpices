package com.prakashspicesfsm.features.viewAllOrder

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.InputFilter
import android.text.TextUtils
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import androidx.fragment.app.DialogFragment
import com.prakashspicesfsm.R
import com.prakashspicesfsm.features.dashboard.presentation.DashboardActivity
import com.prakashspicesfsm.widgets.AppCustomEditText
import com.prakashspicesfsm.widgets.AppCustomTextView

class DialogProductRateQty: DialogFragment() {
    private lateinit var product_name_TV: AppCustomTextView
    private lateinit var rate_edt: AppCustomEditText
    private lateinit var qty_edt: AppCustomEditText
    private lateinit var ok_TV: AppCustomTextView
    private lateinit var mContext: Context

    private lateinit var iv_close_icon: ImageView



    companion object {
        var product_name_str = ""
        var product_rate_str = ""
        fun getInstance(pname:String): DialogProductRateQty {
            val dialogFragment = DialogProductRateQty()
            product_name_str=pname.split("~").get(0)
            product_rate_str=pname.split("~").get(1)
            return dialogFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.mContext = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dialog?.window!!.requestFeature(Window.FEATURE_NO_TITLE)
        dialog?.window!!.setBackgroundDrawableResource(R.drawable.rounded_corner_white_bg)
        val v = inflater?.inflate(R.layout.dialog_product_rate_qty, container, false)
        isCancelable = false
        initView(v)
        return v
    }

    private fun initView(v: View?) {
        product_name_TV = v!!.findViewById(R.id.dialog_ord_shop_name_TV)
        rate_edt = v!!.findViewById(R.id.dialog_ord_rate_edt)
        qty_edt = v!!.findViewById(R.id.dialog_ord_et_order_qty)
        ok_TV = v!!.findViewById(R.id.dialog_ord_add_TV)
        iv_close_icon = v!!.findViewById(R.id.iv_close_icon)

        product_name_TV.text = product_name_str
        rate_edt.setText(product_rate_str)

        ok_TV.setOnClickListener({
            var strRate = rate_edt.text.toString().trim().toString()
            if(strRate.equals("")){
                (mContext as DashboardActivity).rateList.add("0.00")
            }else{
                (mContext as DashboardActivity).rateList.add(rate_edt.text.toString().trim())
            }

            var strQty = qty_edt.text.toString().trim().toString()
            if(strQty.equals("")){
                (mContext as DashboardActivity).qtyList.add("0")
            }else{
                (mContext as DashboardActivity).qtyList.add(qty_edt.text.toString().trim())
            }

            dismiss()
        })

        iv_close_icon.setOnClickListener({
            dismiss()
        })

    }

}